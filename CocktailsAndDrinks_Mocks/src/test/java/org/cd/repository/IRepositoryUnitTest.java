package org.cd.repository;


import org.cd.bo.Drink;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static junit.framework.TestCase.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test - Repository Layer
 */

@RunWith(SpringRunner.class)
@DataJpaTest
public class IRepositoryUnitTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private IRepository iRepository;

    @Test
    public void findByIdTest(){
        //persist
        Drink drink = new Drink();
        drink.setCategoria("Agua");
        Integer receivedId = ((Drink)iRepository.saveAndFlush(drink)).getId_vino();

        //test
        Optional<Drink> found = iRepository.findById(receivedId);//last value
        assertThat(found.get().getCategoria()).isEqualTo(drink.getCategoria());

    }

    @After


    @Test
    public void findByCategoriaTest(){
        Optional<Drink> found = iRepository.findByCategoria("Whiskey");
        assertThat(found.get().getId_vino()).isEqualTo(15);
    }
    
}
