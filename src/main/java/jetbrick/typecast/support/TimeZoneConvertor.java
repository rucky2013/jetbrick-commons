/**
 * Copyright 2013-2014 Guoqiang Chen, Shanghai, China. All rights reserved.
 *
 *   Author: Guoqiang Chen
 *    Email: subchen@gmail.com
 *   WebURL: https://github.com/subchen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrick.typecast.support;

import java.util.TimeZone;
import jetbrick.typecast.Convertor;

public final class TimeZoneConvertor implements Convertor<TimeZone> {
    public static final TimeZoneConvertor INSTANCE = new TimeZoneConvertor();

    @Override
    public TimeZone convert(String value) {
        if (value == null) {
            return null;
        }
        return TimeZone.getTimeZone(value);
    }

    @Override
    public TimeZone convert(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof TimeZone) {
            return (TimeZone) value;
        }
        return TimeZone.getTimeZone(value.toString());
    }
}
