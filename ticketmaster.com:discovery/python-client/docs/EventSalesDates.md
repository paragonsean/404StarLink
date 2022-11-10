# EventSalesDates

Event's Sales Dates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**presales** | [**List[Presale]**](Presale.md) | Presale information on this event | [optional] 
**public** | [**PublicSaleDates**](PublicSaleDates.md) |  | [optional] 

## Example

```python
from openapi_client.models.event_sales_dates import EventSalesDates

# TODO update the JSON string below
json = "{}"
# create an instance of EventSalesDates from a JSON string
event_sales_dates_instance = EventSalesDates.from_json(json)
# print the JSON string representation of the object
print(EventSalesDates.to_json())

# convert the object into a dict
event_sales_dates_dict = event_sales_dates_instance.to_dict()
# create an instance of EventSalesDates from a dict
event_sales_dates_from_dict = EventSalesDates.from_dict(event_sales_dates_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


