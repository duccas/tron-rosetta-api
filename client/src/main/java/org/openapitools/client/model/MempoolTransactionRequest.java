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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.NetworkIdentifier;
import org.openapitools.client.model.TransactionIdentifier;

/**
 * A MempoolTransactionRequest is utilized to retrieve a transaction from the mempool.
 */
@ApiModel(description = "A MempoolTransactionRequest is utilized to retrieve a transaction from the mempool.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-01T16:34:45.305718+08:00[Asia/Shanghai]")
public class MempoolTransactionRequest {
  public static final String SERIALIZED_NAME_NETWORK_IDENTIFIER = "network_identifier";
  @SerializedName(SERIALIZED_NAME_NETWORK_IDENTIFIER)
  private NetworkIdentifier networkIdentifier;

  public static final String SERIALIZED_NAME_TRANSACTION_IDENTIFIER = "transaction_identifier";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_IDENTIFIER)
  private TransactionIdentifier transactionIdentifier;


  public MempoolTransactionRequest networkIdentifier(NetworkIdentifier networkIdentifier) {
    
    this.networkIdentifier = networkIdentifier;
    return this;
  }

   /**
   * Get networkIdentifier
   * @return networkIdentifier
  **/
  @ApiModelProperty(required = true, value = "")

  public NetworkIdentifier getNetworkIdentifier() {
    return networkIdentifier;
  }


  public void setNetworkIdentifier(NetworkIdentifier networkIdentifier) {
    this.networkIdentifier = networkIdentifier;
  }


  public MempoolTransactionRequest transactionIdentifier(TransactionIdentifier transactionIdentifier) {
    
    this.transactionIdentifier = transactionIdentifier;
    return this;
  }

   /**
   * Get transactionIdentifier
   * @return transactionIdentifier
  **/
  @ApiModelProperty(required = true, value = "")

  public TransactionIdentifier getTransactionIdentifier() {
    return transactionIdentifier;
  }


  public void setTransactionIdentifier(TransactionIdentifier transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MempoolTransactionRequest mempoolTransactionRequest = (MempoolTransactionRequest) o;
    return Objects.equals(this.networkIdentifier, mempoolTransactionRequest.networkIdentifier) &&
        Objects.equals(this.transactionIdentifier, mempoolTransactionRequest.transactionIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkIdentifier, transactionIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MempoolTransactionRequest {\n");
    sb.append("    networkIdentifier: ").append(toIndentedString(networkIdentifier)).append("\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

