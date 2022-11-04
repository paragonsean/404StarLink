# UpdatepartialrecurrenceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_day** | **int** |  | 
**delivery_weekday** | **str** |  | 
**status** | **str** |  | 

## Example

```python
from openapi_client.models.updatepartialrecurrence_request import UpdatepartialrecurrenceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatepartialrecurrenceRequest from a JSON string
updatepartialrecurrence_request_instance = UpdatepartialrecurrenceRequest.from_json(json)
# print the JSON string representation of the object
print(UpdatepartialrecurrenceRequest.to_json())

# convert the object into a dict
updatepartialrecurrence_request_dict = updatepartialrecurrence_request_instance.to_dict()
# create an instance of UpdatepartialrecurrenceRequest from a dict
updatepartialrecurrence_request_from_dict = UpdatepartialrecurrenceRequest.from_dict(updatepartialrecurrence_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


