# HttpEndpointDestinationDescriptionBufferingHints


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**size_in_mbs** | **int** |  | [optional] 
**interval_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.http_endpoint_destination_description_buffering_hints import HttpEndpointDestinationDescriptionBufferingHints

# TODO update the JSON string below
json = "{}"
# create an instance of HttpEndpointDestinationDescriptionBufferingHints from a JSON string
http_endpoint_destination_description_buffering_hints_instance = HttpEndpointDestinationDescriptionBufferingHints.from_json(json)
# print the JSON string representation of the object
print(HttpEndpointDestinationDescriptionBufferingHints.to_json())

# convert the object into a dict
http_endpoint_destination_description_buffering_hints_dict = http_endpoint_destination_description_buffering_hints_instance.to_dict()
# create an instance of HttpEndpointDestinationDescriptionBufferingHints from a dict
http_endpoint_destination_description_buffering_hints_from_dict = HttpEndpointDestinationDescriptionBufferingHints.from_dict(http_endpoint_destination_description_buffering_hints_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


