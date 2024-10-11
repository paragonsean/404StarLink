# ListJourneysResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**journeys_response** | [**JourneysResponse**](JourneysResponse.md) |  | 

## Example

```python
from openapi_client.models.list_journeys_response import ListJourneysResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListJourneysResponse from a JSON string
list_journeys_response_instance = ListJourneysResponse.from_json(json)
# print the JSON string representation of the object
print(ListJourneysResponse.to_json())

# convert the object into a dict
list_journeys_response_dict = list_journeys_response_instance.to_dict()
# create an instance of ListJourneysResponse from a dict
list_journeys_response_from_dict = ListJourneysResponse.from_dict(list_journeys_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


