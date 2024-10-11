# TicketmasterEventExtensions

Event's extension (ticketmaster source)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**display_settings** | [**DisplaySettingExtension**](DisplaySettingExtension.md) |  | [optional] 

## Example

```python
from openapi_client.models.ticketmaster_event_extensions import TicketmasterEventExtensions

# TODO update the JSON string below
json = "{}"
# create an instance of TicketmasterEventExtensions from a JSON string
ticketmaster_event_extensions_instance = TicketmasterEventExtensions.from_json(json)
# print the JSON string representation of the object
print(TicketmasterEventExtensions.to_json())

# convert the object into a dict
ticketmaster_event_extensions_dict = ticketmaster_event_extensions_instance.to_dict()
# create an instance of TicketmasterEventExtensions from a dict
ticketmaster_event_extensions_from_dict = TicketmasterEventExtensions.from_dict(ticketmaster_event_extensions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


