# AmazonopensearchserviceRetryOptions

Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon OpenSearch Service. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.amazonopensearchservice_retry_options import AmazonopensearchserviceRetryOptions

# TODO update the JSON string below
json = "{}"
# create an instance of AmazonopensearchserviceRetryOptions from a JSON string
amazonopensearchservice_retry_options_instance = AmazonopensearchserviceRetryOptions.from_json(json)
# print the JSON string representation of the object
print(AmazonopensearchserviceRetryOptions.to_json())

# convert the object into a dict
amazonopensearchservice_retry_options_dict = amazonopensearchservice_retry_options_instance.to_dict()
# create an instance of AmazonopensearchserviceRetryOptions from a dict
amazonopensearchservice_retry_options_from_dict = AmazonopensearchserviceRetryOptions.from_dict(amazonopensearchservice_retry_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


