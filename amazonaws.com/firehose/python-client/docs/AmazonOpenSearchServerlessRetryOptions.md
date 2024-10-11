# AmazonOpenSearchServerlessRetryOptions

Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to the Serverless offering for Amazon OpenSearch Service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.amazon_open_search_serverless_retry_options import AmazonOpenSearchServerlessRetryOptions

# TODO update the JSON string below
json = "{}"
# create an instance of AmazonOpenSearchServerlessRetryOptions from a JSON string
amazon_open_search_serverless_retry_options_instance = AmazonOpenSearchServerlessRetryOptions.from_json(json)
# print the JSON string representation of the object
print(AmazonOpenSearchServerlessRetryOptions.to_json())

# convert the object into a dict
amazon_open_search_serverless_retry_options_dict = amazon_open_search_serverless_retry_options_instance.to_dict()
# create an instance of AmazonOpenSearchServerlessRetryOptions from a dict
amazon_open_search_serverless_retry_options_from_dict = AmazonOpenSearchServerlessRetryOptions.from_dict(amazon_open_search_serverless_retry_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


