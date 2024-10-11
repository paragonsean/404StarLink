# HttpEndpointDescription

Describes the HTTP endpoint selected as the destination. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.http_endpoint_description import HttpEndpointDescription

# TODO update the JSON string below
json = "{}"
# create an instance of HttpEndpointDescription from a JSON string
http_endpoint_description_instance = HttpEndpointDescription.from_json(json)
# print the JSON string representation of the object
print(HttpEndpointDescription.to_json())

# convert the object into a dict
http_endpoint_description_dict = http_endpoint_description_instance.to_dict()
# create an instance of HttpEndpointDescription from a dict
http_endpoint_description_from_dict = HttpEndpointDescription.from_dict(http_endpoint_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


