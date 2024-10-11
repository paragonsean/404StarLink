# CreateJourneyResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**journey_response** | [**JourneyResponse**](JourneyResponse.md) |  | 

## Example

```python
from openapi_client.models.create_journey_response import CreateJourneyResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJourneyResponse from a JSON string
create_journey_response_instance = CreateJourneyResponse.from_json(json)
# print the JSON string representation of the object
print(CreateJourneyResponse.to_json())

# convert the object into a dict
create_journey_response_dict = create_journey_response_instance.to_dict()
# create an instance of CreateJourneyResponse from a dict
create_journey_response_from_dict = CreateJourneyResponse.from_dict(create_journey_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


