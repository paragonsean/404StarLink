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

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictBool
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class AccessDates(BaseModel):
    """
    Event's Access Date
    """ # noqa: E501
    end_approximate: Optional[StrictBool] = Field(default=False, description="Boolean flag to indicate whether or not the access end date is approximated", alias="endApproximate")
    end_date_time: Optional[datetime] = Field(default=None, description="Event's end access time", alias="endDateTime")
    start_approximate: Optional[StrictBool] = Field(default=False, description="Boolean flag to indicate whether or not the access start date is approximated", alias="startApproximate")
    start_date_time: Optional[datetime] = Field(default=None, description="Event's start access time", alias="startDateTime")
    __properties: ClassVar[List[str]] = ["endApproximate", "endDateTime", "startApproximate", "startDateTime"]

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
        """Create an instance of AccessDates from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of AccessDates from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "endApproximate": obj.get("endApproximate") if obj.get("endApproximate") is not None else False,
            "endDateTime": obj.get("endDateTime"),
            "startApproximate": obj.get("startApproximate") if obj.get("startApproximate") is not None else False,
            "startDateTime": obj.get("startDateTime")
        })
        return _obj


