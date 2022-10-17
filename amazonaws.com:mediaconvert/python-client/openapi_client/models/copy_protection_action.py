# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class CopyProtectionAction(str, Enum):
    """
    The action to take on copy and redistribution control XDS packets. If you select PASSTHROUGH, packets will not be changed. If you select STRIP, any packets will be removed in output captions.
    """

    """
    allowed enum values
    """
    PASSTHROUGH = 'PASSTHROUGH'
    STRIP = 'STRIP'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of CopyProtectionAction from a JSON string"""
        return cls(json.loads(json_str))


