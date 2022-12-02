# SplunkRetryOptions

Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to Splunk, or if it doesn't receive an acknowledgment from Splunk.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.splunk_retry_options import SplunkRetryOptions

# TODO update the JSON string below
json = "{}"
# create an instance of SplunkRetryOptions from a JSON string
splunk_retry_options_instance = SplunkRetryOptions.from_json(json)
# print the JSON string representation of the object
print(SplunkRetryOptions.to_json())

# convert the object into a dict
splunk_retry_options_dict = splunk_retry_options_instance.to_dict()
# create an instance of SplunkRetryOptions from a dict
splunk_retry_options_from_dict = SplunkRetryOptions.from_dict(splunk_retry_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


