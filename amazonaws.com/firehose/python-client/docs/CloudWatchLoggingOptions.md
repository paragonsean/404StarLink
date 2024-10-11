# CloudWatchLoggingOptions

Describes the Amazon CloudWatch logging options for your delivery stream.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** |  | [optional] 
**log_group_name** | **str** |  | [optional] 
**log_stream_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.cloud_watch_logging_options import CloudWatchLoggingOptions

# TODO update the JSON string below
json = "{}"
# create an instance of CloudWatchLoggingOptions from a JSON string
cloud_watch_logging_options_instance = CloudWatchLoggingOptions.from_json(json)
# print the JSON string representation of the object
print(CloudWatchLoggingOptions.to_json())

# convert the object into a dict
cloud_watch_logging_options_dict = cloud_watch_logging_options_instance.to_dict()
# create an instance of CloudWatchLoggingOptions from a dict
cloud_watch_logging_options_from_dict = CloudWatchLoggingOptions.from_dict(cloud_watch_logging_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


