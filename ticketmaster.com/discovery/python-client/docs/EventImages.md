# EventImages

This class defines an Event with only images view on the Discovery API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique id of the entity in the discovery API | 
**images** | [**List[Image]**](Image.md) | Images of the entity | [optional] 
**type** | **str** | Type of the entity | 

## Example

```python
from openapi_client.models.event_images import EventImages

# TODO update the JSON string below
json = "{}"
# create an instance of EventImages from a JSON string
event_images_instance = EventImages.from_json(json)
# print the JSON string representation of the object
print(EventImages.to_json())

# convert the object into a dict
event_images_dict = event_images_instance.to_dict()
# create an instance of EventImages from a dict
event_images_from_dict = EventImages.from_dict(event_images_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


