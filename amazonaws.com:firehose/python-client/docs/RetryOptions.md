# RetryOptions

 The retry behavior in case Kinesis Data Firehose is unable to deliver data to an Amazon S3 prefix.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.retry_options import RetryOptions

# TODO update the JSON string below
json = "{}"
# create an instance of RetryOptions from a JSON string
retry_options_instance = RetryOptions.from_json(json)
# print the JSON string representation of the object
print(RetryOptions.to_json())

# convert the object into a dict
retry_options_dict = retry_options_instance.to_dict()
# create an instance of RetryOptions from a dict
retry_options_from_dict = RetryOptions.from_dict(retry_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


