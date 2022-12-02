# HttpEndpointCommonAttribute

Describes the metadata that's delivered to the specified HTTP endpoint destination.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribute_name** | **str** |  | 
**attribute_value** | **str** |  | 

## Example

```python
from openapi_client.models.http_endpoint_common_attribute import HttpEndpointCommonAttribute

# TODO update the JSON string below
json = "{}"
# create an instance of HttpEndpointCommonAttribute from a JSON string
http_endpoint_common_attribute_instance = HttpEndpointCommonAttribute.from_json(json)
# print the JSON string representation of the object
print(HttpEndpointCommonAttribute.to_json())

# convert the object into a dict
http_endpoint_common_attribute_dict = http_endpoint_common_attribute_instance.to_dict()
# create an instance of HttpEndpointCommonAttribute from a dict
http_endpoint_common_attribute_from_dict = HttpEndpointCommonAttribute.from_dict(http_endpoint_common_attribute_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


