# AccessDates

Event's Access Date

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_approximate** | **bool** | Boolean flag to indicate whether or not the access end date is approximated | [optional] [default to False]
**end_date_time** | **datetime** | Event&#39;s end access time | [optional] 
**start_approximate** | **bool** | Boolean flag to indicate whether or not the access start date is approximated | [optional] [default to False]
**start_date_time** | **datetime** | Event&#39;s start access time | [optional] 

## Example

```python
from openapi_client.models.access_dates import AccessDates

# TODO update the JSON string below
json = "{}"
# create an instance of AccessDates from a JSON string
access_dates_instance = AccessDates.from_json(json)
# print the JSON string representation of the object
print(AccessDates.to_json())

# convert the object into a dict
access_dates_dict = access_dates_instance.to_dict()
# create an instance of AccessDates from a dict
access_dates_from_dict = AccessDates.from_dict(access_dates_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


