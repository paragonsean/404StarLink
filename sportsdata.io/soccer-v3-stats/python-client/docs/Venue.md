# Venue


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** |  | [optional] 
**capacity** | **int** |  | [optional] 
**city** | **str** |  | [optional] 
**country** | **str** |  | [optional] 
**geo_lat** | **float** |  | [optional] 
**geo_long** | **float** |  | [optional] 
**name** | **str** |  | [optional] 
**nickname1** | **str** |  | [optional] 
**nickname2** | **str** |  | [optional] 
**open** | **bool** |  | [optional] 
**opened** | **int** |  | [optional] 
**surface** | **str** |  | [optional] 
**venue_id** | **int** |  | [optional] 
**zip** | **str** |  | [optional] 

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


