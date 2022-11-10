# coding: utf-8

"""
    Discovery API

    The Ticketmaster Discovery API allows you to search for events, attractions, or venues.

    The version of the OpenAPI document: v2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional, Union
from openapi_client.models.accessibility import Accessibility
from openapi_client.models.classification import Classification
from openapi_client.models.event_dates import EventDates
from openapi_client.models.event_sales_dates import EventSalesDates
from openapi_client.models.external_link import ExternalLink
from openapi_client.models.image import Image
from openapi_client.models.location import Location
from openapi_client.models.outlet import Outlet
from openapi_client.models.place import Place
from openapi_client.models.price_range import PriceRange
from openapi_client.models.product import Product
from openapi_client.models.promoter import Promoter
from openapi_client.models.seat_map import SeatMap
from typing import Optional, Set
from typing_extensions import Self

class Event(BaseModel):
    """
    Event
    """ # noqa: E501
    accessibility: Optional[Accessibility] = None
    additional_info: Optional[StrictStr] = Field(default=None, description="Additional information of the entity", alias="additionalInfo")
    classifications: Optional[List[Classification]] = Field(default=None, description="Event's classifications")
    dates: Optional[EventDates] = None
    description: Optional[StrictStr] = Field(default=None, description="Description's of the entity")
    distance: Optional[Union[StrictFloat, StrictInt]] = None
    external_links: Optional[Dict[str, List[ExternalLink]]] = Field(default=None, description="List of external links", alias="externalLinks")
    id: StrictStr = Field(description="Unique id of the entity in the discovery API")
    images: Optional[List[Image]] = Field(default=None, description="Images of the entity")
    info: Optional[StrictStr] = Field(default=None, description="Any information related to the event")
    locale: Optional[StrictStr] = Field(default=None, description="Locale in which the content is returned")
    location: Optional[Location] = None
    name: Optional[StrictStr] = Field(default=None, description="Name of the entity")
    outlets: Optional[List[Outlet]] = Field(default=None, description="Related outlets informations")
    place: Optional[Place] = None
    please_note: Optional[StrictStr] = Field(default=None, description="Any notes related to the event", alias="pleaseNote")
    price_ranges: Optional[List[PriceRange]] = Field(default=None, description="Price ranges of this event", alias="priceRanges")
    products: Optional[List[Product]] = Field(default=None, description="Related products informations")
    promoter: Optional[Promoter] = None
    promoters: Optional[List[Promoter]] = Field(default=None, description="Event's promoters")
    sales: Optional[EventSalesDates] = None
    seatmap: Optional[SeatMap] = None
    test: Optional[StrictBool] = Field(default=False, description="Indicate if this is a test entity, by default test entities won't appear in discovery API")
    type: StrictStr = Field(description="Type of the entity")
    units: Optional[StrictStr] = None
    url: Optional[StrictStr] = Field(default=None, description="URL of a web site detail page of the entity")
    __properties: ClassVar[List[str]] = ["accessibility", "additionalInfo", "classifications", "dates", "description", "distance", "externalLinks", "id", "images", "info", "locale", "location", "name", "outlets", "place", "pleaseNote", "priceRanges", "products", "promoter", "promoters", "sales", "seatmap", "test", "type", "units", "url"]

    @field_validator('type')
    def type_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['event', 'venue', 'attraction']):
            raise ValueError("must be one of enum values ('event', 'venue', 'attraction')")
        return value

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of Event from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of accessibility
        if self.accessibility:
            _dict['accessibility'] = self.accessibility.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in classifications (list)
        _items = []
        if self.classifications:
            for _item_classifications in self.classifications:
                if _item_classifications:
                    _items.append(_item_classifications.to_dict())
            _dict['classifications'] = _items
        # override the default output from pydantic by calling `to_dict()` of dates
        if self.dates:
            _dict['dates'] = self.dates.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each value in external_links (dict of array)
        _field_dict_of_array = {}
        if self.external_links:
            for _key_external_links in self.external_links:
                if self.external_links[_key_external_links] is not None:
                    _field_dict_of_array[_key_external_links] = [
                        _item.to_dict() for _item in self.external_links[_key_external_links]
                    ]
            _dict['externalLinks'] = _field_dict_of_array
        # override the default output from pydantic by calling `to_dict()` of each item in images (list)
        _items = []
        if self.images:
            for _item_images in self.images:
                if _item_images:
                    _items.append(_item_images.to_dict())
            _dict['images'] = _items
        # override the default output from pydantic by calling `to_dict()` of location
        if self.location:
            _dict['location'] = self.location.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in outlets (list)
        _items = []
        if self.outlets:
            for _item_outlets in self.outlets:
                if _item_outlets:
                    _items.append(_item_outlets.to_dict())
            _dict['outlets'] = _items
        # override the default output from pydantic by calling `to_dict()` of place
        if self.place:
            _dict['place'] = self.place.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in price_ranges (list)
        _items = []
        if self.price_ranges:
            for _item_price_ranges in self.price_ranges:
                if _item_price_ranges:
                    _items.append(_item_price_ranges.to_dict())
            _dict['priceRanges'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in products (list)
        _items = []
        if self.products:
            for _item_products in self.products:
                if _item_products:
                    _items.append(_item_products.to_dict())
            _dict['products'] = _items
        # override the default output from pydantic by calling `to_dict()` of promoter
        if self.promoter:
            _dict['promoter'] = self.promoter.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in promoters (list)
        _items = []
        if self.promoters:
            for _item_promoters in self.promoters:
                if _item_promoters:
                    _items.append(_item_promoters.to_dict())
            _dict['promoters'] = _items
        # override the default output from pydantic by calling `to_dict()` of sales
        if self.sales:
            _dict['sales'] = self.sales.to_dict()
        # override the default output from pydantic by calling `to_dict()` of seatmap
        if self.seatmap:
            _dict['seatmap'] = self.seatmap.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Event from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "accessibility": Accessibility.from_dict(obj["accessibility"]) if obj.get("accessibility") is not None else None,
            "additionalInfo": obj.get("additionalInfo"),
            "classifications": [Classification.from_dict(_item) for _item in obj["classifications"]] if obj.get("classifications") is not None else None,
            "dates": EventDates.from_dict(obj["dates"]) if obj.get("dates") is not None else None,
            "description": obj.get("description"),
            "distance": obj.get("distance"),
            "externalLinks": dict(
                (_k,
                        [ExternalLink.from_dict(_item) for _item in _v]
                        if _v is not None
                        else None
                )
                for _k, _v in obj.get("externalLinks", {}).items()
            ),
            "id": obj.get("id"),
            "images": [Image.from_dict(_item) for _item in obj["images"]] if obj.get("images") is not None else None,
            "info": obj.get("info"),
            "locale": obj.get("locale"),
            "location": Location.from_dict(obj["location"]) if obj.get("location") is not None else None,
            "name": obj.get("name"),
            "outlets": [Outlet.from_dict(_item) for _item in obj["outlets"]] if obj.get("outlets") is not None else None,
            "place": Place.from_dict(obj["place"]) if obj.get("place") is not None else None,
            "pleaseNote": obj.get("pleaseNote"),
            "priceRanges": [PriceRange.from_dict(_item) for _item in obj["priceRanges"]] if obj.get("priceRanges") is not None else None,
            "products": [Product.from_dict(_item) for _item in obj["products"]] if obj.get("products") is not None else None,
            "promoter": Promoter.from_dict(obj["promoter"]) if obj.get("promoter") is not None else None,
            "promoters": [Promoter.from_dict(_item) for _item in obj["promoters"]] if obj.get("promoters") is not None else None,
            "sales": EventSalesDates.from_dict(obj["sales"]) if obj.get("sales") is not None else None,
            "seatmap": SeatMap.from_dict(obj["seatmap"]) if obj.get("seatmap") is not None else None,
            "test": obj.get("test") if obj.get("test") is not None else False,
            "type": obj.get("type"),
            "units": obj.get("units"),
            "url": obj.get("url")
        })
        return _obj


