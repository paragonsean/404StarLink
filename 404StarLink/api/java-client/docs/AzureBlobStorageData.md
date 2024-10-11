

# AzureBlobStorageData

An AzureBlobStorageData resource can be a data source, but not a data sink. An AzureBlobStorageData resource represents one Azure container. The storage account determines the [Azure endpoint](https://docs.microsoft.com/en-us/azure/storage/common/storage-create-storage-account#storage-account-endpoints). In an AzureBlobStorageData resource, a blobs's name is the [Azure Blob Storage blob's key name](https://docs.microsoft.com/en-us/rest/api/storageservices/naming-and-referencing-containers--blobs--and-metadata#blob-names).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**azureCredentials** | [**AzureCredentials**](AzureCredentials.md) |  |  [optional] |
|**container** | **String** | Required. The container to transfer from the Azure Storage account. |  [optional] |
|**path** | **String** | Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;. |  [optional] |
|**storageAccount** | **String** | Required. The name of the Azure Storage account. |  [optional] |



