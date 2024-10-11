

# CloudStorageFile

The export file in Cloud Storage

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bucketName** | **String** | The name of the Cloud Storage bucket for the export file. You can use this value in the [Cloud Storage JSON or XML APIs](https://cloud.google.com/storage/docs/apis), but not to list the bucket contents. Instead, you can [get individual export files](https://cloud.google.com/storage/docs/json_api/v1/objects/get) by object name. |  [optional] |
|**md5Hash** | **String** | The md5 hash of the file. |  [optional] |
|**objectName** | **String** | The name of the Cloud Storage object for the export file. You can use this value in the [Cloud Storage JSON or XML APIs](https://cloud.google.com/storage/docs/apis). |  [optional] |
|**size** | **String** | The export file size. |  [optional] |



