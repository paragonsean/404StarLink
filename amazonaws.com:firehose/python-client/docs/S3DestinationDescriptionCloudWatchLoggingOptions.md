# S3DestinationDescriptionCloudWatchLoggingOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** |  | [optional] 
**log_group_name** | **str** |  | [optional] 
**log_stream_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.s3_destination_description_cloud_watch_logging_options import S3DestinationDescriptionCloudWatchLoggingOptions

# TODO update the JSON string below
json = "{}"
# create an instance of S3DestinationDescriptionCloudWatchLoggingOptions from a JSON string
s3_destination_description_cloud_watch_logging_options_instance = S3DestinationDescriptionCloudWatchLoggingOptions.from_json(json)
# print the JSON string representation of the object
print(S3DestinationDescriptionCloudWatchLoggingOptions.to_json())

# convert the object into a dict
s3_destination_description_cloud_watch_logging_options_dict = s3_destination_description_cloud_watch_logging_options_instance.to_dict()
# create an instance of S3DestinationDescriptionCloudWatchLoggingOptions from a dict
s3_destination_description_cloud_watch_logging_options_from_dict = S3DestinationDescriptionCloudWatchLoggingOptions.from_dict(s3_destination_description_cloud_watch_logging_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


