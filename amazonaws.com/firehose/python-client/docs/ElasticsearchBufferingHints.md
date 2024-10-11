# ElasticsearchBufferingHints

Describes the buffering to perform before delivering data to the Amazon ES destination.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interval_in_seconds** | **int** |  | [optional] 
**size_in_mbs** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.elasticsearch_buffering_hints import ElasticsearchBufferingHints

# TODO update the JSON string below
json = "{}"
# create an instance of ElasticsearchBufferingHints from a JSON string
elasticsearch_buffering_hints_instance = ElasticsearchBufferingHints.from_json(json)
# print the JSON string representation of the object
print(ElasticsearchBufferingHints.to_json())

# convert the object into a dict
elasticsearch_buffering_hints_dict = elasticsearch_buffering_hints_instance.to_dict()
# create an instance of ElasticsearchBufferingHints from a dict
elasticsearch_buffering_hints_from_dict = ElasticsearchBufferingHints.from_dict(elasticsearch_buffering_hints_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


