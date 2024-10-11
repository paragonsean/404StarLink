# Event

Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessibility** | [**Accessibility**](Accessibility.md) |  | [optional] 
**additional_info** | **str** | Additional information of the entity | [optional] 
**classifications** | [**List[Classification]**](Classification.md) | Event&#39;s classifications | [optional] 
**dates** | [**EventDates**](EventDates.md) |  | [optional] 
**description** | **str** | Description&#39;s of the entity | [optional] 
**distance** | **float** |  | [optional] 
**external_links** | **Dict[str, List[ExternalLink]]** | List of external links | [optional] 
**id** | **str** | Unique id of the entity in the discovery API | 
**images** | [**List[Image]**](Image.md) | Images of the entity | [optional] 
**info** | **str** | Any information related to the event | [optional] 
**locale** | **str** | Locale in which the content is returned | [optional] 
**location** | [**Location**](Location.md) |  | [optional] 
**name** | **str** | Name of the entity | [optional] 
**outlets** | [**List[Outlet]**](Outlet.md) | Related outlets informations | [optional] 
**place** | [**Place**](Place.md) |  | [optional] 
**please_note** | **str** | Any notes related to the event | [optional] 
**price_ranges** | [**List[PriceRange]**](PriceRange.md) | Price ranges of this event | [optional] 
**products** | [**List[Product]**](Product.md) | Related products informations | [optional] 
**promoter** | [**Promoter**](Promoter.md) |  | [optional] 
**promoters** | [**List[Promoter]**](Promoter.md) | Event&#39;s promoters | [optional] 
**sales** | [**EventSalesDates**](EventSalesDates.md) |  | [optional] 
**seatmap** | [**SeatMap**](SeatMap.md) |  | [optional] 
**test** | **bool** | Indicate if this is a test entity, by default test entities won&#39;t appear in discovery API | [optional] [default to False]
**type** | **str** | Type of the entity | 
**units** | **str** |  | [optional] 
**url** | **str** | URL of a web site detail page of the entity | [optional] 

## Example

```python
from openapi_client.models.event import Event

# TODO update the JSON string below
json = "{}"
# create an instance of Event from a JSON string
event_instance = Event.from_json(json)
# print the JSON string representation of the object
print(Event.to_json())

# convert the object into a dict
event_dict = event_instance.to_dict()
# create an instance of Event from a dict
event_from_dict = Event.from_dict(event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


