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


class CmfcTimedMetadataBoxVersion(str, Enum):
    """
    Specify the event message box (eMSG) version for ID3 timed metadata in your output. For more information, see ISO/IEC 23009-1:2022 section 5.10.3.3.3 Syntax. Leave blank to use the default value Version 0. When you specify Version 1, you must also set ID3 metadata (timedMetadata) to Passthrough.
    """

    """
    allowed enum values
    """
    VERSION_0 = 'VERSION_0'
    VERSION_1 = 'VERSION_1'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of CmfcTimedMetadataBoxVersion from a JSON string"""
        return cls(json.loads(json_str))


