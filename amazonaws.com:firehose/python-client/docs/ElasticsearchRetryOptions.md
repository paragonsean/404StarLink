# ElasticsearchRetryOptions

Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.elasticsearch_retry_options import ElasticsearchRetryOptions

# TODO update the JSON string below
json = "{}"
# create an instance of ElasticsearchRetryOptions from a JSON string
elasticsearch_retry_options_instance = ElasticsearchRetryOptions.from_json(json)
# print the JSON string representation of the object
print(ElasticsearchRetryOptions.to_json())

# convert the object into a dict
elasticsearch_retry_options_dict = elasticsearch_retry_options_instance.to_dict()
# create an instance of ElasticsearchRetryOptions from a dict
elasticsearch_retry_options_from_dict = ElasticsearchRetryOptions.from_dict(elasticsearch_retry_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


