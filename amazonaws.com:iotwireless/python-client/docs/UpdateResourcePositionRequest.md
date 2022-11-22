# UpdateResourcePositionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**geo_json_payload** | **str** | The position information of the resource, displayed as a JSON payload. The payload uses the GeoJSON format, which a format that&#39;s used to encode geographic data structures. For more information, see &lt;a href&#x3D;\&quot;https://geojson.org/\&quot;&gt;GeoJSON&lt;/a&gt;. | [optional] 

## Example

```python
from openapi_client.models.update_resource_position_request import UpdateResourcePositionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateResourcePositionRequest from a JSON string
update_resource_position_request_instance = UpdateResourcePositionRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateResourcePositionRequest.to_json())

# convert the object into a dict
update_resource_position_request_dict = update_resource_position_request_instance.to_dict()
# create an instance of UpdateResourcePositionRequest from a dict
update_resource_position_request_from_dict = UpdateResourcePositionRequest.from_dict(update_resource_position_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


