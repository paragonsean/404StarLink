# ElasticsearchDestinationDescriptionBufferingHints


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interval_in_seconds** | **int** |  | [optional] 
**size_in_mbs** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.elasticsearch_destination_description_buffering_hints import ElasticsearchDestinationDescriptionBufferingHints

# TODO update the JSON string below
json = "{}"
# create an instance of ElasticsearchDestinationDescriptionBufferingHints from a JSON string
elasticsearch_destination_description_buffering_hints_instance = ElasticsearchDestinationDescriptionBufferingHints.from_json(json)
# print the JSON string representation of the object
print(ElasticsearchDestinationDescriptionBufferingHints.to_json())

# convert the object into a dict
elasticsearch_destination_description_buffering_hints_dict = elasticsearch_destination_description_buffering_hints_instance.to_dict()
# create an instance of ElasticsearchDestinationDescriptionBufferingHints from a dict
elasticsearch_destination_description_buffering_hints_from_dict = ElasticsearchDestinationDescriptionBufferingHints.from_dict(elasticsearch_destination_description_buffering_hints_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


