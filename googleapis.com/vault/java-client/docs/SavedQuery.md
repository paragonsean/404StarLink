

# SavedQuery

The definition of a saved query. To work with Vault resources, the account must have the [required Vault privileges](https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter, the account must have created the matter, have the matter shared with them, or have the **View All Matters** privilege.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createTime** | **String** | Output only. The server-generated timestamp when the saved query was created. |  [optional] |
|**displayName** | **String** | The name of the saved query. |  [optional] |
|**matterId** | **String** | Output only. The matter ID of the matter the saved query is saved in. The server does not use this field during create and always uses matter ID in the URL. |  [optional] |
|**query** | [**Query**](Query.md) |  |  [optional] |
|**savedQueryId** | **String** | A unique identifier for the saved query. |  [optional] |



