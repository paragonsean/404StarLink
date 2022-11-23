# coding: utf-8

"""
    SiriKit Cloud Media

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing_extensions import Annotated
from typing import Optional, Set
from typing_extensions import Self

class PlayerContext(BaseModel):
    """
    PlayerContext
    """ # noqa: E501
    activity_identifier: Optional[Annotated[str, Field(strict=True, max_length=250)]] = Field(default=None, alias="activityIdentifier")
    content_identifier: Optional[Annotated[str, Field(min_length=1, strict=True, max_length=1000)]] = Field(default=None, alias="contentIdentifier")
    offset_in_millis: Optional[StrictInt] = Field(default=None, alias="offsetInMillis")
    playback_speed: Optional[Union[StrictFloat, StrictInt]] = Field(default=1, alias="playbackSpeed")
    queue_identifier: Optional[Annotated[str, Field(min_length=1, strict=True, max_length=1024)]] = Field(default=None, alias="queueIdentifier")
    __properties: ClassVar[List[str]] = ["activityIdentifier", "contentIdentifier", "offsetInMillis", "playbackSpeed", "queueIdentifier"]

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
        """Create an instance of PlayerContext from a JSON string"""
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
        """Create an instance of PlayerContext from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "activityIdentifier": obj.get("activityIdentifier"),
            "contentIdentifier": obj.get("contentIdentifier"),
            "offsetInMillis": obj.get("offsetInMillis"),
            "playbackSpeed": obj.get("playbackSpeed") if obj.get("playbackSpeed") is not None else 1,
            "queueIdentifier": obj.get("queueIdentifier")
        })
        return _obj


