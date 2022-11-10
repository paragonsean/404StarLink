# PublicSaleDates

Event's Public Onsales Dates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_date_time** | **datetime** | Public sale&#39;s end dates. The date and time when the public sale will end | [optional] 
**start_date_time** | **datetime** | Public sale&#39;s start dates. The date and time when the public sale will start | [optional] 
**start_tbd** | **bool** | True if the public sale&#39;s date is to be determined | [optional] [default to False]

## Example

```python
from openapi_client.models.public_sale_dates import PublicSaleDates

# TODO update the JSON string below
json = "{}"
# create an instance of PublicSaleDates from a JSON string
public_sale_dates_instance = PublicSaleDates.from_json(json)
# print the JSON string representation of the object
print(PublicSaleDates.to_json())

# convert the object into a dict
public_sale_dates_dict = public_sale_dates_instance.to_dict()
# create an instance of PublicSaleDates from a dict
public_sale_dates_from_dict = PublicSaleDates.from_dict(public_sale_dates_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


