# coding: utf-8

"""
    Transcoder API

    This API converts video files into formats suitable for consumer distribution. 

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.audio_atom import AudioAtom
from typing import Optional, Set
from typing_extensions import Self

class AudioStream(BaseModel):
    """
    Audio stream resource.
    """ # noqa: E501
    bitrate_bps: Optional[StrictInt] = Field(default=None, description="Required. Audio bitrate in bits per second. Must be between 1 and 10,000,000.", alias="bitrateBps")
    channel_count: Optional[StrictInt] = Field(default=None, description="Number of audio channels. Must be between 1 and 6. The default is 2.", alias="channelCount")
    channel_layout: Optional[List[StrictStr]] = Field(default=None, description="A list of channel names specifying layout of the audio channels. This only affects the metadata embedded in the container headers, if supported by the specified format. The default is `[\"fl\", \"fr\"]`. Supported channel names: - 'fl' - Front left channel - 'fr' - Front right channel - 'sl' - Side left channel - 'sr' - Side right channel - 'fc' - Front center channel - 'lfe' - Low frequency", alias="channelLayout")
    codec: Optional[StrictStr] = Field(default=None, description="The codec for this audio stream. The default is `\"aac\"`. Supported audio codecs: - 'aac' - 'aac-he' - 'aac-he-v2' - 'mp3' - 'ac3' - 'eac3'")
    mapping: Optional[List[AudioAtom]] = Field(default=None, description="The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`.")
    sample_rate_hertz: Optional[StrictInt] = Field(default=None, description="The audio sample rate in Hertz. The default is 48000 Hertz.", alias="sampleRateHertz")
    __properties: ClassVar[List[str]] = ["bitrateBps", "channelCount", "channelLayout", "codec", "mapping", "sampleRateHertz"]

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
        """Create an instance of AudioStream from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in mapping (list)
        _items = []
        if self.mapping:
            for _item_mapping in self.mapping:
                if _item_mapping:
                    _items.append(_item_mapping.to_dict())
            _dict['mapping'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of AudioStream from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "bitrateBps": obj.get("bitrateBps"),
            "channelCount": obj.get("channelCount"),
            "channelLayout": obj.get("channelLayout"),
            "codec": obj.get("codec"),
            "mapping": [AudioAtom.from_dict(_item) for _item in obj["mapping"]] if obj.get("mapping") is not None else None,
            "sampleRateHertz": obj.get("sampleRateHertz")
        })
        return _obj


