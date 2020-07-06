/*
 * Rosetta
 * Build Once. Integrate Your Blockchain Everywhere.
 *
 * The version of the OpenAPI document: 1.4.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.MetadataRequest;
import org.openapitools.client.model.NetworkListResponse;
import org.openapitools.client.model.NetworkOptionsResponse;
import org.openapitools.client.model.NetworkRequest;
import org.openapitools.client.model.NetworkStatusResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetworkApi
 */
@Ignore
public class NetworkApiTest {

    private final NetworkApi api = new NetworkApi();

    
    /**
     * Get List of Available Networks
     *
     * This endpoint returns a list of NetworkIdentifiers that the Rosetta server supports.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkListTest() throws ApiException {
        MetadataRequest metadataRequest = null;
        NetworkListResponse response = api.networkList(metadataRequest);

        // TODO: test validations
    }
    
    /**
     * Get Network Options
     *
     * This endpoint returns the version information and allowed network-specific types for a NetworkIdentifier. Any NetworkIdentifier returned by /network/list should be accessible here. Because options are retrievable in the context of a NetworkIdentifier, it is possible to define unique options for each network.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkOptionsTest() throws ApiException {
        NetworkRequest networkRequest = null;
        NetworkOptionsResponse response = api.networkOptions(networkRequest);

        // TODO: test validations
    }
    
    /**
     * Get Network Status
     *
     * This endpoint returns the current status of the network requested. Any NetworkIdentifier returned by /network/list should be accessible here.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkStatusTest() throws ApiException {
        NetworkRequest networkRequest = null;
        NetworkStatusResponse response = api.networkStatus(networkRequest);

        // TODO: test validations
    }
    
}
