# HttpEndpointBufferingHints

Describes the buffering options that can be applied before data is delivered to the HTTP endpoint destination. Kinesis Data Firehose treats these options as hints, and it might choose to use more optimal values. The <code>SizeInMBs</code> and <code>IntervalInSeconds</code> parameters are optional. However, if specify a value for one of them, you must also provide a value for the other. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**size_in_mbs** | **int** |  | [optional] 
**interval_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.http_endpoint_buffering_hints import HttpEndpointBufferingHints

# TODO update the JSON string below
json = "{}"
# create an instance of HttpEndpointBufferingHints from a JSON string
http_endpoint_buffering_hints_instance = HttpEndpointBufferingHints.from_json(json)
# print the JSON string representation of the object
print(HttpEndpointBufferingHints.to_json())

# convert the object into a dict
http_endpoint_buffering_hints_dict = http_endpoint_buffering_hints_instance.to_dict()
# create an instance of HttpEndpointBufferingHints from a dict
http_endpoint_buffering_hints_from_dict = HttpEndpointBufferingHints.from_dict(http_endpoint_buffering_hints_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


