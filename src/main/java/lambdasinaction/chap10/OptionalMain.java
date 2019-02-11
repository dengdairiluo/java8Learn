package lambdasinaction.chap10;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-02-11 23:40
 */
public class OptionalMain {

    public String getCarInsuranceName(Optional<Person> person) {
        return person.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
    }

//    public Set<String> getCarInsuranceNames(List<Person> persons) {
//        return persons.stream()
//                .map(Person::getCar)
//                .map(optCar -> optCar.flatMap(Car::getInsurance))
//                .map(optInsurance -> optInsurance.map(Insurance::getName))
//                .flatMap(Optional::stream)
//                .collect(Collectors.toSet());
//    }

}
