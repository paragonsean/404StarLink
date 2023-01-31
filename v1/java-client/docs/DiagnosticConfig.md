

# DiagnosticConfig

Defines flags that are used to run the diagnostic tool

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**copyHomeFilesFlagEnabled** | **Boolean** | Optional. Enables flag to copy all &#x60;/home/jupyter&#x60; folder contents |  [optional] |
|**gcsBucket** | **String** | Required. User Cloud Storage bucket location (REQUIRED). Must be formatted with path prefix (&#x60;gs://$GCS_BUCKET&#x60;). Permissions: User Managed Notebooks: - storage.buckets.writer: Must be given to the project&#39;s service account attached to VM. Google Managed Notebooks: - storage.buckets.writer: Must be given to the project&#39;s service account or user credentials attached to VM depending on authentication mode. Cloud Storage bucket Log file will be written to &#x60;gs://$GCS_BUCKET/$RELATIVE_PATH/$VM_DATE_$TIME.tar.gz&#x60; |  [optional] |
|**packetCaptureFlagEnabled** | **Boolean** | Optional. Enables flag to capture packets from the instance for 30 seconds |  [optional] |
|**relativePath** | **String** | Optional. Defines the relative storage path in the Cloud Storage bucket where the diagnostic logs will be written: Default path will be the root directory of the Cloud Storage bucket (&#x60;gs://$GCS_BUCKET/$DATE_$TIME.tar.gz&#x60;) Example of full path where Log file will be written: &#x60;gs://$GCS_BUCKET/$RELATIVE_PATH/&#x60; |  [optional] |
|**repairFlagEnabled** | **Boolean** | Optional. Enables flag to repair service for instance |  [optional] |



