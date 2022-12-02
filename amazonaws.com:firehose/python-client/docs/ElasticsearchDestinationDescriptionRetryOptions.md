# ElasticsearchDestinationDescriptionRetryOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.elasticsearch_destination_description_retry_options import ElasticsearchDestinationDescriptionRetryOptions

# TODO update the JSON string below
json = "{}"
# create an instance of ElasticsearchDestinationDescriptionRetryOptions from a JSON string
elasticsearch_destination_description_retry_options_instance = ElasticsearchDestinationDescriptionRetryOptions.from_json(json)
# print the JSON string representation of the object
print(ElasticsearchDestinationDescriptionRetryOptions.to_json())

# convert the object into a dict
elasticsearch_destination_description_retry_options_dict = elasticsearch_destination_description_retry_options_instance.to_dict()
# create an instance of ElasticsearchDestinationDescriptionRetryOptions from a dict
elasticsearch_destination_description_retry_options_from_dict = ElasticsearchDestinationDescriptionRetryOptions.from_dict(elasticsearch_destination_description_retry_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


