# Getting started

Mtn MOMO Doc

## How to Build

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=MtnMOM%20Collection&workspaceName=MtnMOMCollection&projectName=MtnMOMCollectionLib&rootNamespace=com.mtn.momodeveloper.sandbox)

* Browse to locate the folder containing the source code. Select the location of the MtnMOMCollection gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=MtnMOM%20Collection&workspaceName=MtnMOMCollection&projectName=MtnMOMCollectionLib&rootNamespace=com.mtn.momodeveloper.sandbox)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=MtnMOM%20Collection&workspaceName=MtnMOMCollection&projectName=MtnMOMCollectionLib&rootNamespace=com.mtn.momodeveloper.sandbox)

## How to Use

The following section explains how to use the MtnMOMCollection library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=MtnMOM%20Collection&workspaceName=MtnMOMCollection&projectName=MtnMOMCollectionLib&rootNamespace=com.mtn.momodeveloper.sandbox)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=MtnMOM%20Collection&workspaceName=MtnMOMCollection&projectName=MtnMOMCollectionLib&rootNamespace=com.mtn.momodeveloper.sandbox)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=MtnMOM%20Collection&workspaceName=MtnMOMCollection&projectName=MtnMOMCollectionLib&rootNamespace=com.mtn.momodeveloper.sandbox)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=MtnMOM%20Collection&workspaceName=MtnMOMCollection&projectName=MtnMOMCollectionLib&rootNamespace=com.mtn.momodeveloper.sandbox)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=MtnMOM%20Collection&workspaceName=MtnMOMCollection&projectName=MtnMOMCollectionLib&rootNamespace=com.mtn.momodeveloper.sandbox)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=MtnMOM%20Collection&workspaceName=MtnMOMCollection&projectName=MtnMOMCollectionLib&rootNamespace=com.mtn.momodeveloper.sandbox)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=MtnMOM%20Collection&workspaceName=MtnMOMCollection&projectName=MtnMOMCollectionLib&rootNamespace=com.mtn.momodeveloper.sandbox)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=MtnMOM%20Collection&workspaceName=MtnMOMCollection&projectName=MtnMOMCollectionLib&rootNamespace=com.mtn.momodeveloper.sandbox)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=MtnMOM%20Collection&workspaceName=MtnMOMCollection&projectName=MtnMOMCollectionLib&rootNamespace=com.mtn.momodeveloper.sandbox)

In the following step first navigate to the ``` SampleApplication > settings.gradle ``` file and add the line
```include ':MtnMOMCollectionLib'```

Then navigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line 
```implementation project(path: ':MtnMOMCollectionLib')```
to the dependencies section as shown in the illustration below. Also add the following packagingOptions.

packagingOptions
    exclude 'META-INF/LICENSE'
    exclude 'META-INF/NOTICE'
    exclude 'META-INF/DEPENDENCIES'
}

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=MtnMOM%20Collection&workspaceName=MtnMOMCollection&projectName=MtnMOMCollectionLib&rootNamespace=com.mtn.momodeveloper.sandbox)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=MtnMOM%20Collection&workspaceName=MtnMOMCollection&projectName=MtnMOMCollectionLib&rootNamespace=com.mtn.momodeveloper.sandbox)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > MtnMOMCollectionLib > androidTest > java)* from the project explorer.
2. Select "Run All Tests" or use "Ctrl + Shift + F10" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| ocpApimSubscriptionKey | TODO: add a description |



API client can be initialized as following. The `appContext` being passed is the Android application [`Context`](https://developer.android.com/reference/android/content/Context.html).

```java
// Configuration parameters and credentials
String ocpApimSubscriptionKey = "ocpApimSubscriptionKey";

com.mtn.momodeveloper.sandbox.Configuration.initialize(appContext);
MtnMOMCollectionClient client = new MtnMOMCollectionClient(ocpApimSubscriptionKey);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [APIController](#api_controller)

## <a name="api_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mtn.momodeveloper.sandbox.controllers.APIController") APIController

### Get singleton instance

The singleton instance of the ``` APIController ``` class can be accessed from the API Client.

```java
APIController client = client.getClient();
```

### <a name="create_token_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mtn.momodeveloper.sandbox.controllers.APIController.createTokenPOSTAsync") createTokenPOSTAsync

> This operation is used to create an access token which can then be used to authorize and authenticate towards the other end-points of the API.


```java
void createTokenPOSTAsync(
        final String authorization,
        final APICallBack<TokenPost200ApplicationJsonResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | Basic authentication header containing API user ID and API key. Should be sent in as B64 encoded. |


#### Example Usage

```java
String authorization = "Authorization";
// Invoking the API call with sample inputs
client.createTokenPOSTAsync(authorization, new APICallBack<TokenPost200ApplicationJsonResponse>() {
    public void onSuccess(HttpContext context, TokenPost200ApplicationJsonResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |
| 500 | Error |



### <a name="get_v10_account_balance_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mtn.momodeveloper.sandbox.controllers.APIController.getV10AccountBalanceAsync") getV10AccountBalanceAsync

> Get the balance of the account.


```java
void getV10AccountBalanceAsync(
        final String xTargetEnvironment,
        final String authorization,
        final APICallBack<Balance> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xTargetEnvironment |  ``` Required ```  | The identifier of the EWP system where the transaction shall be processed. This parameter is used to route the request to the EWP system that will initiate the transaction. |
| authorization |  ``` Optional ```  | Authorization header used for Basic authentication and oauth. Format of the header parameter follows the standard for Basic and Bearer. Oauth uses Bearer authentication type where the credential is the received access token. |


#### Example Usage

```java
String xTargetEnvironment = "X-Target-Environment";
String authorization = "Authorization";
// Invoking the API call with sample inputs
client.getV10AccountBalanceAsync(xTargetEnvironment, authorization, new APICallBack<Balance>() {
    public void onSuccess(HttpContext context, Balance response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Bad request, e.g. invalid data was sent in the request. |
| 500 | Internal error. The returned response contains details. |



### <a name="get_v10_accountholder_accountholderidtype_accountholderid_active_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mtn.momodeveloper.sandbox.controllers.APIController.getV10AccountholderAccountholderidtypeAccountholderidActiveAsync") getV10AccountholderAccountholderidtypeAccountholderidActiveAsync

> Operation is used  to check if an account holder is registered and active in the system.


```java
void getV10AccountholderAccountholderidtypeAccountholderidActiveAsync(
        final String accountHolderId,
        final String accountHolderIdType,
        final String xTargetEnvironment,
        final String authorization,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountHolderId |  ``` Required ```  | The party number. Validated according to the party ID type (case Sensitive). <br> msisdn - Mobile Number validated according to ITU-T E.164. Validated with IsMSISDN<br> email - Validated to be a valid e-mail format. Validated with IsEmail<br> party_code - UUID of the party. Validated with IsUuid |
| accountHolderIdType |  ``` Required ```  | Specifies the type of the party ID. Allowed values [msisdn, email, party_code].  <br> accountHolderId should explicitly be in small letters. |
| xTargetEnvironment |  ``` Required ```  | The identifier of the EWP system where the transaction shall be processed. This parameter is used to route the request to the EWP system that will initiate the transaction. |
| authorization |  ``` Optional ```  | Authorization header used for Basic authentication and oauth. Format of the header parameter follows the standard for Basic and Bearer. Oauth uses Bearer authentication type where the credential is the received access token. |


#### Example Usage

```java
String accountHolderId = "accountHolderId";
String accountHolderIdType = "accountHolderIdType";
String xTargetEnvironment = "X-Target-Environment";
String authorization = "Authorization";
// Invoking the API call with sample inputs
client.getV10AccountholderAccountholderidtypeAccountholderidActiveAsync(accountHolderId, accountHolderIdType, xTargetEnvironment, authorization, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Bad request, e.g. invalid data was sent in the request. |
| 500 | Internal error. The returned response contains details. |



### <a name="create_requesttopay_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mtn.momodeveloper.sandbox.controllers.APIController.createRequesttopayPOSTAsync") createRequesttopayPOSTAsync

> This operation is used to request a payment from a consumer (Payer). The payer will be asked to authorize the payment. The transaction will be executed once the payer has authorized the payment. The requesttopay will be in status PENDING until the transaction is authorized or declined by the payer or it is timed out by the system. 
>  Status of the transaction can be validated by using the GET /requesttopay/\<resourceId\>


```java
void createRequesttopayPOSTAsync(
        final String xReferenceId,
        final String xTargetEnvironment,
        final String authorization,
        final String xCallbackUrl,
        final RequestToPay body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xReferenceId |  ``` Required ```  | Format - UUID. Recource ID of the created request to pay transaction. This ID is used, for example, validating the status of the request. ‘Universal Unique ID’ for the transaction generated using UUID version 4. |
| xTargetEnvironment |  ``` Required ```  | The identifier of the EWP system where the transaction shall be processed. This parameter is used to route the request to the EWP system that will initiate the transaction. |
| authorization |  ``` Optional ```  | Authorization header used for Basic authentication and oauth. Format of the header parameter follows the standard for Basic and Bearer. Oauth uses Bearer authentication type where the credential is the received access token. |
| xCallbackUrl |  ``` Optional ```  | URL to the server where the callback should be sent. |
| body |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String xReferenceId = "X-Reference-Id";
    String xTargetEnvironment = "X-Target-Environment";
    String authorization = "Authorization";
    String xCallbackUrl = "X-Callback-Url";
    RequestToPay body = new RequestToPay();
    // Invoking the API call with sample inputs
    client.createRequesttopayPOSTAsync(xReferenceId, xTargetEnvironment, authorization, xCallbackUrl, body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Bad request, e.g. invalid data was sent in the request. |
| 409 | Conflict, duplicated reference id |
| 500 | Internal Error. |



### <a name="get_requesttopay_reference_id_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mtn.momodeveloper.sandbox.controllers.APIController.getRequesttopayReferenceIdGETAsync") getRequesttopayReferenceIdGETAsync

> This operation is used to get the status of a request to pay. X-Reference-Id that was passed in the post is used as reference to the request.


```java
void getRequesttopayReferenceIdGETAsync(
        final String referenceId,
        final String xTargetEnvironment,
        final String authorization,
        final APICallBack<RequestToPayResult> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| referenceId |  ``` Required ```  | UUID of transaction to get result. Reference id  used when creating the request to pay. |
| xTargetEnvironment |  ``` Required ```  | The identifier of the EWP system where the transaction shall be processed. This parameter is used to route the request to the EWP system that will initiate the transaction. |
| authorization |  ``` Optional ```  | Authorization header used for Basic authentication and oauth. Format of the header parameter follows the standard for Basic and Bearer. Oauth uses Bearer authentication type where the credential is the received access token. |


#### Example Usage

```java
String referenceId = "referenceId";
String xTargetEnvironment = "X-Target-Environment";
String authorization = "Authorization";
// Invoking the API call with sample inputs
client.getRequesttopayReferenceIdGETAsync(referenceId, xTargetEnvironment, authorization, new APICallBack<RequestToPayResult>() {
    public void onSuccess(HttpContext context, RequestToPayResult response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Bad request, e.g. an incorrectly formatted reference id was provided. |
| 404 | Resource not found. |
| 500 | Internal Error. Note that if the retrieved request to pay has failed, it will not cause this status to be returned. This status is only returned if the GET request itself fails. |



[Back to List of Controllers](#list_of_controllers)



