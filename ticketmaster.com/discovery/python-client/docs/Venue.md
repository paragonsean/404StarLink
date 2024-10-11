# Venue

Venue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessible_seating_detail** | **str** | Venue accessible seating detail | [optional] 
**additional_info** | **str** | Additional information of the entity | [optional] 
**address** | [**Address**](Address.md) |  | [optional] 
**box_office_info** | [**VenueBoxOfficeInfo**](VenueBoxOfficeInfo.md) |  | [optional] 
**city** | [**City**](City.md) |  | [optional] 
**country** | [**Country**](Country.md) |  | [optional] 
**currency** | **str** | Default currency of ticket prices for events in this venue | [optional] 
**description** | **str** | Description&#39;s of the entity | [optional] 
**distance** | **float** |  | [optional] 
**dma** | [**List[Dma]**](Dma.md) | The list of associated DMAs (Designated Market Areas) of the venue | [optional] 
**external_links** | **Dict[str, List[ExternalLink]]** | List of external links | [optional] 
**general_info** | [**VenueGeneralInfo**](VenueGeneralInfo.md) |  | [optional] 
**id** | **str** | Unique id of the entity in the discovery API | 
**images** | [**List[Image]**](Image.md) | Images of the entity | [optional] 
**locale** | **str** | Locale in which the content is returned | [optional] 
**location** | [**Location**](Location.md) |  | [optional] 
**markets** | [**List[Market]**](Market.md) | Markets of the venue | [optional] 
**name** | **str** | Name of the entity | [optional] 
**parking_detail** | **str** | Venue parking info | [optional] 
**postal_code** | **str** | Postal code / zipcode of the venue | [optional] 
**social** | [**Social**](Social.md) |  | [optional] 
**state** | [**State**](State.md) |  | [optional] 
**test** | **bool** | Indicate if this is a test entity, by default test entities won&#39;t appear in discovery API | [optional] [default to False]
**timezone** | **str** | Timezone of the venue | [optional] 
**type** | **str** | Type of the entity | 
**units** | **str** |  | [optional] 
**upcoming_events** | **Dict[str, int]** | number of upcoming events | [optional] 
**url** | **str** | URL of a web site detail page of the entity | [optional] 

## Example

```python
from openapi_client.models.venue import Venue

# TODO update the JSON string below
json = "{}"
# create an instance of Venue from a JSON string
venue_instance = Venue.from_json(json)
# print the JSON string representation of the object
print(Venue.to_json())

# convert the object into a dict
venue_dict = venue_instance.to_dict()
# create an instance of Venue from a dict
venue_from_dict = Venue.from_dict(venue_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


