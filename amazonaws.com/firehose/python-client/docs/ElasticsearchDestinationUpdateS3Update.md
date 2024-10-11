# ElasticsearchDestinationUpdateS3Update


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | [optional] 
**bucket_arn** | **str** |  | [optional] 
**prefix** | **str** |  | [optional] 
**error_output_prefix** | **str** |  | [optional] 
**buffering_hints** | [**S3DestinationConfigurationBufferingHints**](S3DestinationConfigurationBufferingHints.md) |  | [optional] 
**compression_format** | [**CompressionFormat**](CompressionFormat.md) |  | [optional] 
**encryption_configuration** | [**S3DestinationConfigurationEncryptionConfiguration**](S3DestinationConfigurationEncryptionConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**S3DestinationConfigurationCloudWatchLoggingOptions**](S3DestinationConfigurationCloudWatchLoggingOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.elasticsearch_destination_update_s3_update import ElasticsearchDestinationUpdateS3Update

# TODO update the JSON string below
json = "{}"
# create an instance of ElasticsearchDestinationUpdateS3Update from a JSON string
elasticsearch_destination_update_s3_update_instance = ElasticsearchDestinationUpdateS3Update.from_json(json)
# print the JSON string representation of the object
print(ElasticsearchDestinationUpdateS3Update.to_json())

# convert the object into a dict
elasticsearch_destination_update_s3_update_dict = elasticsearch_destination_update_s3_update_instance.to_dict()
# create an instance of ElasticsearchDestinationUpdateS3Update from a dict
elasticsearch_destination_update_s3_update_from_dict = ElasticsearchDestinationUpdateS3Update.from_dict(elasticsearch_destination_update_s3_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


