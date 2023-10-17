package config;

import org.aeonbits.owner.ConfigFactory;
import org.aeonbits.owner.Reloadable;
import org.aeonbits.owner.Config;

@Config.Sources({
        "file:src/test/resources/properties/test.properties"
})
public interface Properties extends Reloadable {
    Properties properties = ConfigFactory.create(Properties.class);

    @Key("baseUrlCreateUser")
    String baseUrlCreateUser();

    @Key("baseUrlRickAndMorty")
    String baseUrlRickAndMorty();

    @Key("idPerson")
    String idPerson();
}
