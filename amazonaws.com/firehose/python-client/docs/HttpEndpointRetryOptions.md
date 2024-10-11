# HttpEndpointRetryOptions

Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the specified HTTP endpoint destination, or if it doesn't receive a valid acknowledgment of receipt from the specified HTTP endpoint destination.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.http_endpoint_retry_options import HttpEndpointRetryOptions

# TODO update the JSON string below
json = "{}"
# create an instance of HttpEndpointRetryOptions from a JSON string
http_endpoint_retry_options_instance = HttpEndpointRetryOptions.from_json(json)
# print the JSON string representation of the object
print(HttpEndpointRetryOptions.to_json())

# convert the object into a dict
http_endpoint_retry_options_dict = http_endpoint_retry_options_instance.to_dict()
# create an instance of HttpEndpointRetryOptions from a dict
http_endpoint_retry_options_from_dict = HttpEndpointRetryOptions.from_dict(http_endpoint_retry_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


