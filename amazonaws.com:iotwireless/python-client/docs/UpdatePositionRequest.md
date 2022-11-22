# UpdatePositionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**position** | **List[float]** | The position information of the resource. | 

## Example

```python
from openapi_client.models.update_position_request import UpdatePositionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePositionRequest from a JSON string
update_position_request_instance = UpdatePositionRequest.from_json(json)
# print the JSON string representation of the object
print(UpdatePositionRequest.to_json())

# convert the object into a dict
update_position_request_dict = update_position_request_instance.to_dict()
# create an instance of UpdatePositionRequest from a dict
update_position_request_from_dict = UpdatePositionRequest.from_dict(update_position_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


