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

from importlib import import_module
from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Union
from typing import Optional, Set
from typing_extensions import Self

from typing import TYPE_CHECKING
if TYPE_CHECKING:
    from openapi_client.models.media_destination_library import MediaDestinationLibrary
    from openapi_client.models.media_destination_playlist import MediaDestinationPlaylist

class MediaDestination(BaseModel):
    """
    MediaDestination
    """ # noqa: E501
    media_destination_type: StrictStr = Field(alias="mediaDestinationType")
    __properties: ClassVar[List[str]] = ["mediaDestinationType"]

    @field_validator('media_destination_type')
    def media_destination_type_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['library', 'playlist']):
            raise ValueError("must be one of enum values ('library', 'playlist')")
        return value

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    # JSON field name that stores the object type
    __discriminator_property_name: ClassVar[str] = 'mediaDestinationType'

    # discriminator mappings
    __discriminator_value_class_map: ClassVar[Dict[str, str]] = {
        'library': 'MediaDestinationLibrary','playlist': 'MediaDestinationPlaylist'
    }

    @classmethod
    def get_discriminator_value(cls, obj: Dict[str, Any]) -> Optional[str]:
        """Returns the discriminator value (object type) of the data"""
        discriminator_value = obj[cls.__discriminator_property_name]
        if discriminator_value:
            return cls.__discriminator_value_class_map.get(discriminator_value)
        else:
            return None

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Union[MediaDestinationLibrary, MediaDestinationPlaylist]]:
        """Create an instance of MediaDestination from a JSON string"""
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
    def from_dict(cls, obj: Dict[str, Any]) -> Optional[Union[MediaDestinationLibrary, MediaDestinationPlaylist]]:
        """Create an instance of MediaDestination from a dict"""
        # look up the object type based on discriminator mapping
        object_type = cls.get_discriminator_value(obj)
        if object_type ==  'MediaDestinationLibrary':
            return import_module("openapi_client.models.media_destination_library").MediaDestinationLibrary.from_dict(obj)
        if object_type ==  'MediaDestinationPlaylist':
            return import_module("openapi_client.models.media_destination_playlist").MediaDestinationPlaylist.from_dict(obj)

        raise ValueError("MediaDestination failed to lookup discriminator value from " +
                            json.dumps(obj) + ". Discriminator property name: " + cls.__discriminator_property_name +
                            ", mapping: " + json.dumps(cls.__discriminator_value_class_map))


