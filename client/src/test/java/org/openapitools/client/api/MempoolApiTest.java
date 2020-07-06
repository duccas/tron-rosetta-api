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
import org.openapitools.client.model.MempoolResponse;
import org.openapitools.client.model.MempoolTransactionRequest;
import org.openapitools.client.model.MempoolTransactionResponse;
import org.openapitools.client.model.NetworkRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MempoolApi
 */
@Ignore
public class MempoolApiTest {

    private final MempoolApi api = new MempoolApi();

    
    /**
     * Get All Mempool Transactions
     *
     * Get all Transaction Identifiers in the mempool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mempoolTest() throws ApiException {
        NetworkRequest networkRequest = null;
        MempoolResponse response = api.mempool(networkRequest);

        // TODO: test validations
    }
    
    /**
     * Get a Mempool Transaction
     *
     * Get a transaction in the mempool by its Transaction Identifier. This is a separate request than fetching a block transaction (/block/transaction) because some blockchain nodes need to know that a transaction query is for something in the mempool instead of a transaction in a block. Transactions may not be fully parsable until they are in a block (ex: may not be possible to determine the fee to pay before a transaction is executed). On this endpoint, it is ok that returned transactions are only estimates of what may actually be included in a block.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mempoolTransactionTest() throws ApiException {
        MempoolTransactionRequest mempoolTransactionRequest = null;
        MempoolTransactionResponse response = api.mempoolTransaction(mempoolTransactionRequest);

        // TODO: test validations
    }
    
}
