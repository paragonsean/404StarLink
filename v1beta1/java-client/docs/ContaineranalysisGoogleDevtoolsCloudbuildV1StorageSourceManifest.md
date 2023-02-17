

# ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest

Location of the source manifest in Google Cloud Storage. This feature is in Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bucket** | **String** | Google Cloud Storage bucket containing the source manifest (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). |  [optional] |
|**generation** | **String** | Google Cloud Storage generation for the object. If the generation is omitted, the latest generation will be used. |  [optional] |
|**_object** | **String** | Google Cloud Storage object containing the source manifest. This object must be a JSON file. |  [optional] |



