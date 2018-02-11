package icfbundles.inmemory;

import java.util.Map;
import java.util.Set;

import org.identityconnectors.framework.api.operations.GetApiOp;
import org.identityconnectors.framework.common.objects.*;
import org.identityconnectors.framework.common.objects.filter.FilterTranslator;
import org.identityconnectors.framework.spi.Configuration;
import org.identityconnectors.framework.spi.ConnectorClass;
import org.identityconnectors.framework.spi.PoolableConnector;
import org.identityconnectors.framework.spi.operations.*;

/**
 * Created by adharmad on 2/11/18.
 */
@ConnectorClass(configurationClass = InMemoryConfiguration.class, displayNameKey = "InMemory")
public class InMemoryConnector implements SchemaOp,  CreateOp, DeleteOp,
        UpdateOp, SearchOp<Map<String, String>>, GetApiOp, PoolableConnector {

    private InMemoryConfiguration configuration;

    @Override
    public ConnectorObject getObject(ObjectClass objectClass, Uid uid, OperationOptions operationOptions) {
        return null;
    }

    @Override
    public void checkAlive() {

    }

    @Override
    public Configuration getConfiguration() {
        return configuration;
    }

    @Override
    public void init(Configuration configuration) {

    }

    @Override
    public void dispose() {

    }

    @Override
    public Uid create(ObjectClass objectClass, Set<Attribute> set, OperationOptions operationOptions) {
        return null;
    }

    @Override
    public void delete(ObjectClass objectClass, Uid uid, OperationOptions operationOptions) {

    }

    @Override
    public Schema schema() {
        return null;
    }

    @Override
    public FilterTranslator<Map<String, String>> createFilterTranslator(ObjectClass objectClass, OperationOptions operationOptions) {
        return null;
    }

    @Override
    public void executeQuery(ObjectClass objectClass, Map<String, String> stringStringMap, ResultsHandler resultsHandler, OperationOptions operationOptions) {

    }

    @Override
    public Uid update(ObjectClass objectClass, Uid uid, Set<Attribute> set, OperationOptions operationOptions) {
        return null;
    }
}
