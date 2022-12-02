# ElasticsearchDestinationDescriptionCloudWatchLoggingOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** |  | [optional] 
**log_group_name** | **str** |  | [optional] 
**log_stream_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.elasticsearch_destination_description_cloud_watch_logging_options import ElasticsearchDestinationDescriptionCloudWatchLoggingOptions

# TODO update the JSON string below
json = "{}"
# create an instance of ElasticsearchDestinationDescriptionCloudWatchLoggingOptions from a JSON string
elasticsearch_destination_description_cloud_watch_logging_options_instance = ElasticsearchDestinationDescriptionCloudWatchLoggingOptions.from_json(json)
# print the JSON string representation of the object
print(ElasticsearchDestinationDescriptionCloudWatchLoggingOptions.to_json())

# convert the object into a dict
elasticsearch_destination_description_cloud_watch_logging_options_dict = elasticsearch_destination_description_cloud_watch_logging_options_instance.to_dict()
# create an instance of ElasticsearchDestinationDescriptionCloudWatchLoggingOptions from a dict
elasticsearch_destination_description_cloud_watch_logging_options_from_dict = ElasticsearchDestinationDescriptionCloudWatchLoggingOptions.from_dict(elasticsearch_destination_description_cloud_watch_logging_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


