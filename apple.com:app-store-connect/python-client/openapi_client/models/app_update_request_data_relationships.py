# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.app_update_request_data_relationships_available_territories import AppUpdateRequestDataRelationshipsAvailableTerritories
from openapi_client.models.app_update_request_data_relationships_prices import AppUpdateRequestDataRelationshipsPrices
from typing import Optional, Set
from typing_extensions import Self

class AppUpdateRequestDataRelationships(BaseModel):
    """
    AppUpdateRequestDataRelationships
    """ # noqa: E501
    available_territories: Optional[AppUpdateRequestDataRelationshipsAvailableTerritories] = Field(default=None, alias="availableTerritories")
    prices: Optional[AppUpdateRequestDataRelationshipsPrices] = None
    __properties: ClassVar[List[str]] = ["availableTerritories", "prices"]

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
        """Create an instance of AppUpdateRequestDataRelationships from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of available_territories
        if self.available_territories:
            _dict['availableTerritories'] = self.available_territories.to_dict()
        # override the default output from pydantic by calling `to_dict()` of prices
        if self.prices:
            _dict['prices'] = self.prices.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of AppUpdateRequestDataRelationships from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "availableTerritories": AppUpdateRequestDataRelationshipsAvailableTerritories.from_dict(obj["availableTerritories"]) if obj.get("availableTerritories") is not None else None,
            "prices": AppUpdateRequestDataRelationshipsPrices.from_dict(obj["prices"]) if obj.get("prices") is not None else None
        })
        return _obj


