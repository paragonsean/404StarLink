# Attraction

Attraction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_info** | **str** | Additional information of the entity | [optional] 
**classifications** | [**List[Classification]**](Classification.md) | Attraction&#39;s classifications | [optional] 
**description** | **str** | Description&#39;s of the entity | [optional] 
**external_links** | **Dict[str, List[ExternalLink]]** | List of external links | [optional] 
**id** | **str** | Unique id of the entity in the discovery API | 
**images** | [**List[Image]**](Image.md) | Images of the entity | [optional] 
**locale** | **str** | Locale in which the content is returned | [optional] 
**name** | **str** | Name of the entity | [optional] 
**test** | **bool** | Indicate if this is a test entity, by default test entities won&#39;t appear in discovery API | [optional] [default to False]
**type** | **str** | Type of the entity | 
**upcoming_events** | **Dict[str, int]** | number of upcoming events | [optional] 
**url** | **str** | URL of a web site detail page of the entity | [optional] 

## Example

```python
from openapi_client.models.attraction import Attraction

# TODO update the JSON string below
json = "{}"
# create an instance of Attraction from a JSON string
attraction_instance = Attraction.from_json(json)
# print the JSON string representation of the object
print(Attraction.to_json())

# convert the object into a dict
attraction_dict = attraction_instance.to_dict()
# create an instance of Attraction from a dict
attraction_from_dict = Attraction.from_dict(attraction_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


