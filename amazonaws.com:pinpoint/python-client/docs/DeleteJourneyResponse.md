# DeleteJourneyResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**journey_response** | [**JourneyResponse**](JourneyResponse.md) |  | 

## Example

```python
from openapi_client.models.delete_journey_response import DeleteJourneyResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteJourneyResponse from a JSON string
delete_journey_response_instance = DeleteJourneyResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteJourneyResponse.to_json())

# convert the object into a dict
delete_journey_response_dict = delete_journey_response_instance.to_dict()
# create an instance of DeleteJourneyResponse from a dict
delete_journey_response_from_dict = DeleteJourneyResponse.from_dict(delete_journey_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


